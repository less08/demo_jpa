angular.module("registration_form",[])
    .controller("RegistrationCtr", function ($scope, $http) {
        $scope.auth = {};
        $scope.sendForm = function(auth){
            $http({
                method: "POST",
                url: "/registration",
                data: $.param(auth),
                headers: { "Content-Type" :  "application/x-www-form-urlencoded"}
            }).then(
                function(data) {
                    window.alert("Доступ разрешен");
                },
                function(error) {
                    window.alert("Доступ запрещен");
                }
            );
        }
    });