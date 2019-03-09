<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    <script
            src="https://code.jquery.com/jquery-2.2.4.min.js"
            integrity="sha256-BbhdlvQf/xTY9gja0Dq3HiwQF8LaCRTXxZKRutelT44="
            crossorigin="anonymous"></script>

    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>

</head>
<body>
<div class="container">

    <div  class="row">
        <div class="col-sm-12">

            <table  class="table table-striped table-bordered table-hover" >
               <thead>

               <tr  class="success">
                   <th>Lp</th>
                   <th>Id</th>
                   <th>Imie i nazwisko</th>
                   <th>Email</th>
                   <th class="col-sm-1"></th>
               </tr>

               </thead>
                <tbody>
                <tr>
                    <td>1</td>
                    <td>130</td>
                    <td>Kacper Szweda</td>
                    <td>Kacper@email.com</td>
                    <td>
                        <a class="btn btn-primary  btn-block" href="">Edytuj</a>
                        <button data-toggle="modal" data-target="#potwierdzenie" class="btn btn-danger  btn-block">Usun</button>
                    </td>
                </tr>
                <tr>
                    <td>2</td>
                    <td>900</td>
                    <td>Madison Beer</td>
                    <td>Madison@email.com</td>


                    <td>
                        <a class="btn btn-primary  btn-block" href="">Edytuj</a>
                        <button data-toggle="modal" data-target="#potwierdzenie" class="btn btn-danger  btn-block">Usun</button>
                    </td>
                </tr>




                </tbody>


            </table>





        </div>

    </div>
    <button class="btn btn-primary btn btn-primary btn-lg btn-block"> Dodaj</button>
    <button type="button" class="btn btn-danger btn btn-primary btn-lg btn-block">Usun</button>

</div>

<div id="potwierdzenie" class="modal fade" tabindex="-1" role="dialog">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title">Zlikwidowac</h4>
            </div>
            <div class="modal-body">
                <p>Napewno tego chcesz?</p>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">Zamknij</button>
                <button type="button" class="btn btn-danger">Usun</button>
            </div>
        </div>
    </div>
</div>
<skript>
$('#exampleModal').on('show.bs.modal', function (event) {
  var button = $(event.relatedTarget)
  var nazwa = button.data('nazwa')
    var id = button.data('id')
  var modal = $(this)
  $('#nazwa-uzytkownika',modal).text(nazwa)
    $('#id-uzytkownika',modal).text(id)
    })
</skript>
</body>
</html>