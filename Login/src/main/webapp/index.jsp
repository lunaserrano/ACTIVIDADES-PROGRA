<html>
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js">
  <link rel="stylesheet" href="css/stylesLogin.css">
  <title>Document</title>
</head>
<body>
  <main role="main" class="container my-auto">
            <div class="row">
                <div id="login" class="col-lg-4 offset-lg-4 col-md-6 offset-md-3
                    col-12">
                    <h2 class="text-center">Bienvenido de nuevo</h2>

                    <form method="post" action="ServleteUser">
                        <div class="content">
                          <div class="form-group">
                              <label for="Usuario">Usuario</label>
                              <input  name="usuario" class="form-control" type="text" placeholder="Usuario">
                          </div>
                          <div class="form-group">
                              <label for="pass">Password</label>
                              <input name="password" class="form-control" type="password" placeholder="Password">
                          </div>
                          <button type="submit" class="btn btn-primary mb-2">Entrar</button>
                        </div>
                    </form>
                </div>
            </div>
        </main>

</body>
</html>
