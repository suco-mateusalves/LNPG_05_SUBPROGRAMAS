import Data.List

-- Definição de tipos
type Evento = String
type Agenda = [Evento]

-- Função principal
main :: IO ()
main = do
    putStrLn "Bem-vindo ao Gerenciador de Agenda!"
    loop []

-- Função de loop para interação com o usuário
loop :: Agenda -> IO ()
loop agenda = do
    putStrLn "\nSelecione uma opção:"
    putStrLn "1. Adicionar evento"
    putStrLn "2. Remover evento"
    putStrLn "3. Visualizar agenda"
    putStrLn "4. Sair"
    opcao <- getLine
    case opcao of
        "1" -> do
            novaAgenda <- adicionarEvento agenda
            loop novaAgenda
        "2" -> do
            novaAgenda <- removerEvento agenda
            loop novaAgenda
        "3" -> do
            visualizarAgenda agenda
            loop agenda
        "4" -> putStrLn "Saindo do programa..."
        _   -> do
            putStrLn "Opção inválida. Tente novamente."
            loop agenda

-- Função para adicionar um evento à agenda
adicionarEvento :: Agenda -> IO Agenda
adicionarEvento agenda = do
    putStrLn "Digite o evento a ser adicionado:"
    evento <- getLine
    return (agenda ++ [evento])

-- Função para remover um evento da agenda
removerEvento :: Agenda -> IO Agenda
removerEvento agenda = do
    putStrLn "Digite o índice do evento a ser removido:"
    indiceStr <- getLine
    let indice = read indiceStr
    if indice < 1 || indice > length agenda
        then do
            putStrLn "Índice inválido. Tente novamente."
            return agenda
        else do
            let novaAgenda = delete (agenda !! (indice - 1)) agenda
            return novaAgenda

-- Função para visualizar a agenda
visualizarAgenda :: Agenda -> IO ()
visualizarAgenda agenda = do
    putStrLn "Eventos na Agenda:"
    mapM_ putStrLn $ zipWith (\i evento -> show i ++ ". " ++ evento) [1..] agenda
