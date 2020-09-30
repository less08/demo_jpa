angular.module("conferences_form",[])
    .controller("ConferencesCtrl", ["$scope", "$http", function ($scope, $http) {
        console.log("conferencesCtrl")
        $scope.conferences = [];
        $scope.getConferences = function(){
            $http({
                method: "GET",
                url: "/conferences",
                headers: { "Content-Type" : "application/json" }
            }).then(
                function(data) {
                    $scope.conferences = data.data.conferences;
                },
                function(error) {
                    console.log("ConferencesCtrl error")
                }
            );
        }
    }]);