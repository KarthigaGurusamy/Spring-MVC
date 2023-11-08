<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Login</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet"
              integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
              crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
                integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
                crossorigin="anonymous"></script>
    </head>
    <body>
        <div class="container my-5">
            <div class="row my-5">
                <div class="col-4 my-5"></div>
                <div class="col-4 my-5">
                    <h1 class="text-center my-5">Register</h1>
                    <form method="GET" class="mx-3 my-3 " action="register">

                    <label>UserName:</label>
                    <br>
                    <input type="text" name="username">
                    <br>
                    <label>Password:</label>
                    <br>
                    <input type="password" name="password">
                    <br>
                    <label>Confirm Password:</label>
                    <br>
                    <input type="password" name="cpassword">
                    <br>
                    <label>Gender:</label>
                    <br>

                    <input type="radio" name="gender" value="Male">Male
                    <input type="radio" value="Female" name="gender">
                    Female
                    <br>
                    <input type="submit" value="Register">

                </div>


                </form>
            </div>
            <div class="col-4"></div>
        </div>
    </div>
</body>
        </html>