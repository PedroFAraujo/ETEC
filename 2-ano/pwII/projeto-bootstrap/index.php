<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="style.css">
        <title>Cadastro</title>
    </head>
    <body>
        <main>
        <div class="container text-center">
            <div class="row">
                <div class="col">
                    <nav class="navbar navbar-expand-lg bg-body-tertiary">
                        <div class="container-fluid">
                            <a class="navbar-brand" href="index.php">SISTEMA WEB</a>
                            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                                <span class="navbar-toggler-icon"></span>
                            </button>
                            <div class="collapse navbar-collapse" id="navbarNav">
                                <ul class="navbar-nav">
                                    <li class="nav-item">
                                        <a class="nav-link active" aria-current="page" href="index.php">Cadastrar</a>
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
                    <h1>Cadastrar - Agendamento de Potenciais Clientes</h1>
                    <p>Sistema Utilizado para agendamento de serviços</p>
                </div>
            </div>
            <div class="row">
                <div class="col">
                <form method="POST" action="teste.class.php">
                    <div class="mb-3">
                        <label for="exampleFormControlInput1" class="form-label"><span class="label-input">Nome:</span></label>
                        <input type="email" class="form-control" id="exampleFormControlInput1" required>
                    </div>
                </form>
                </div>
            </div>
            <div class="row">
                <div class="col">
                <form method="POST" action="teste.class.php">
                    <div class="mb-3">
                        <label for="exampleFormControlInput1" class="form-label">Telefone: </label>
                        <input type="email" class="form-control" id="exampleFormControlInput1" placeholder="(xx)xxxxx-xxxx" required>
                    </div>
                </form>
                </div>
            </div>
            <div class="row">
                <div class="col">
                <form method="POST" action="teste.class.php">
                    <div class="mb-3">
                        <label for="exampleFormControlInput1" class="form-label">Origem: </label>
                        <input type="" class="form-control" id="exampleFormControlInput1" required>
                    </div>
                </form>
                </div>
            </div>
            <div class="row">
                <div class="col">
                <form method="POST" action="teste.class.php">
                    <div class="mb-3">
                        <label for="exampleFormControlInput1" class="form-label">Data do Contato: </label>
                        <input type="date" class="form-control" id="exampleFormControlInput1" placeholder="(xx)xxxxx-xxxx" required>
                    </div>
                </form>
                </div>
            </div>
            <div class="row">
                <div class="col">
                    <form method="POST" action="teste.class.php">
                    <div class="mb-3">
                        <label for="exampleFormControlTextarea1" class="form-label">Observação:</label>
                        <textarea class="form-control" id="exampleFormControlTextarea1" rows="3"></textarea>
                    </div>
                    </form>
                </div>
            </div>
            <div class="row">
                <div class="col">
                    <input type="button" value="Cadastrar" name="cadastrar" id="cadastrar">
                </div>
            </div>
        </div>
        </main>
    </body>
</html>