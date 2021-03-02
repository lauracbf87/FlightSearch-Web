<%-- 
    Document   : index
    Created on : Mar 1, 2021, 11:03:13 AM
    Author     : Laura.Barragan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Flight Search</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.bundle.min.js" integrity="sha384-b5kHyXgcpbZJO/tY9Ul7kGkf1S0CWuKcCD38l8YkeH8z8QjE0GmW1gYU5S9FOnJ0" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.6.0/dist/umd/popper.min.js" integrity="sha384-KsvD1yqQ1/1+IA7gi3P0tyJcT3vR+NdBTt13hSJ2lnve8agRGXTTyNaBYmCR/Nwi" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.min.js" integrity="sha384-nsg8ua9HAw1y0W1btsyWgBklPnCUAFLuTMS2G72MMONqmOymq585AcH49TLBQObG" crossorigin="anonymous"></script>
        <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.9.0/css/bootstrap-datepicker.min.css" integrity="sha512-mSYUmp1HYZDFaVKK//63EcZq4iFWFjxSL+Z3T/aCt4IO9Cejm03q3NKKYN6pFQzY0SBOr8h+eCIAZHPXcpZaNw==" crossorigin="anonymous" />
        <script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.9.0/js/bootstrap-datepicker.min.js" integrity="sha512-T/tUfKSV1bihCnd+MxKD0Hm1uBBroVYBOYSk1knyvQ9VyZJpc/ALb4P0r6ubwVPSGB2GvjeoMAJJImBG12TiaQ==" crossorigin="anonymous"></script>
    </head>
    <body style="padding: 20px;">
        <h1>Flight Search Webapp!</h1>
        <div class="panel" id="searchInput">
            <div class="row">
                <div class="col-6">
                    <div class="row card">
                        <div class="form-group">
                            <div><label>Departure Location:</label></div>
                            <div><input class="form-control" type="text" id="departureLoction"></div>
                        </div>
                        <div class="form-group">
                            <div><label>Arrival Location:</label></div>
                            <div><input class="form-control" type="text" id="arrivalLocation"></div>
                        </div>
                        <div class="form-group">
                            <div><label>Flight Date:</label></div>

                            <input class="datepicker form-control" type="text" id="flightDate">
                            <i class="glyphicon glyphicon-th"></i>

                        </div>
                        <div class="form-group">
                            <div><label>Flight Class:</label></div>
                            <div><input class="form-control" type="text" id="flightClass"></div>
                        </div>
                        <div class="form-group">
                            <div><label>Output Preference:</label></div>
                            <div><input class="form-control" type="text" id="outputPreference"></div>
                        </div>
                    </div>
                </div>
                <div class="col-6">
                    <a href="#" class="btn btn-primary" id="btn-search">Search</a>
                </div>
            </div>

        </div>
        <div class="panel" id="searchResults">
            <table class="table table-striped table-hover table-responsive">
                <thead>
                    <tr>
                        <th>FLIGHT_NO
                        </th>
                        <th>DEP_LOC
                        </th>
                        <th>ARR_LOC
                        </th>
                        <th>VALID_TILL</th>
                        <th>
                            FLIGHT_TIME
                        </th>
                        <th>FLIGHT_DUR 
                        </th>
                        <th>FARE
                        </th>
                        <th>SEAT_AVAILABILITY
                        </th>
                        <th>CLASS
                        </th>
                    </tr>
                </thead>
                <tbody id="resultsPane">
                    <tr>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td>yy</td>
                    </tr>
                    <tr>
                        <td>xx</td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td>yy</td>
                    </tr>
                </tbody>
            </table>

        </div>
        <script>
            $('.datepicker').datepicker({
                daysOfWeekDisabled: "0,1"
            });
        </script>
        <script>
            const getSearchData = () => {
                return {
                    departureLoction: "",
                    arrivalLocation: "",
                    flightDate: "",
                    flightClass: "",
                    outputPreference: ""
                }
            };
            $('#btn-search').click(() => {

                $.post('/flight-search-web/searchFlight',
                        getSearchData(),
                        (responseText)=> {
                            var data = JSON.parse(responseText);
                            $('#resultsPane').html(transformJsonToTR(data));
                        },
                        "application/json");
            });
        </script>
    </body>
</html>
