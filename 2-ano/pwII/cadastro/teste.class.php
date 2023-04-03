
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="style.css">
        <link rel="stylesheet" href="styleDados.css">
        <title>Cadastro</title>
    </head>
    <body>
        <main id="teste.classe">
            <div class="container" id="container">
                <div class="row">
                    <div class="col">
                        <nav class="navbar navbar-expand-lg bg-body-tertiary, fundo">
                            <div class="container-fluid">
                                <a class="navbar-brand" href="index.php">SISTEMA WEB</a>
                                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                                    <span class="navbar-toggler-icon"></span>
                                </button>
                                <div class="collapse navbar-collapse" id="navbarNav">
                                    <ul class="navbar-nav">
                                        <li class="nav-item">
                                            <a class="nav-link active" id="link-header" aria-current="page" href="index.php">Cadastrar</a>
                                        </li>
                                        <li class="nav-item">
                                            <a class="nav-link" href="#">Consultar</a>
                                        </li>
                                    </ul>
                                </div>
                            </div>
                        </nav>
                    </div>
                </div>
                <div class="row">
                    <div class="col titles">
                        <h1>Consultar - Contatos Agendados</h1>
                    </div>
                </div>
                <div class="row">
                    <div class="col boxDados">
                        <div class="p-3 mb-2 bg-primary text-white dados">
                            <?php

                                require_once("pessoa.class.php");

                                class Teste{
                                    private $pessoa;

                                    public function __construct(){
                                        $pessoa = new Pessoa();
                                        
                                        $pessoa->setNome($_POST['nome']);
                                        echo "<Strong>Nome:</Strong> " . $pessoa->getNome();
                                        echo "⠀⠀⠀⠀";
                                        $pessoa->setTelefone($_POST['telefone']);
                                        echo "<Strong>Telefone:</Strong> " . $pessoa->getTelefone();
                                        echo "⠀⠀⠀⠀";
                                        $pessoa->setOrigem($_POST['origem']);
                                        echo "<Strong>Origem:</Strong> " . $pessoa->getOrigem();
                                        echo "⠀⠀⠀⠀";
                                        $pessoa->setData($_POST['date']);
                                        echo "<Strong>Data:</Strong> " . $pessoa->getData();
                                        echo "⠀⠀⠀⠀";
                                        $pessoa->setObservacao($_POST['obs']);
                                        echo "<Strong>Observação:</Strong> " .  $pessoa->getObservacao();
                                    }
                                }new Teste();

                            ?>
                        </div>
                    </div>
                </div>
            </div>
        </main>
    </body>

        