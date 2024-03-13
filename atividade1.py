import re

def ler_arquivo(caminho_arquivo):
    try:
        with open(caminho_arquivo, 'r', encoding='utf-8') as arquivo:
            texto = arquivo.read()
        return texto
    except FileNotFoundError:
        print("Arquivo não encontrado.")
        return None

def contar_palavras(texto):
    palavras = re.findall(r'\b\w+\b', texto)  # Usando expressão regular para pegar palavras
    return len(palavras)

def palavra_mais_longa(texto):
    palavras = re.findall(r'\b\w+\b', texto) # Regex de novo
    return max(palavras, key=len)

def vogal_mais_frequente(texto):
    vogais = 'aeiou'
    contador_vogais = {vogal: 0 for vogal in vogais} # expressão cria um dicionário onde as chaves são as vogais

    for caractere in texto:
        if caractere.lower() in vogais:
            contador_vogais[caractere.lower()] += 1

    return max(contador_vogais, key=contador_vogais.get)

def encontrar_linha_com_cao(texto):
    linhas = texto.split('\n')
    for i, linha in enumerate(linhas):
        if 'ção' in linha:
            return i + 1  # Adicionamos 1 pois o índice começa em 0
    return None

def main():
    caminho_arquivo = input("Digite o caminho para o arquivo texto: ")

    texto = ler_arquivo(caminho_arquivo)

    if texto:
        palavras = contar_palavras(texto)
        print(f"Quantidade de palavras no arquivo: {palavras}")

        palavra_longa = palavra_mais_longa(texto)
        print(f"A palavra mais longa é: {palavra_longa}")

        vogal_frequente = vogal_mais_frequente(texto)
        print(f"A vogal mais frequente é: {vogal_frequente}")

        linha_cao = encontrar_linha_com_cao(texto)
        if linha_cao:
            print(f"A palavra 'ção' aparece na linha: {linha_cao}")
        else:
            print("A palavra 'ção' não foi encontrada no texto.")

if __name__ == "__main__":
    main()
