var app = angular.module("geektic", ['ngRoute']);

/*app.controller('HelloCtrl', function($scope, $http) {
    $http.get('/api/hello').success(function(helloMessage) {
        $scope.helloMessage = helloMessage;
    });
});
*/


app.controller('HelloCtrl', function($scope, $http) {
    $http.get('/api/hello').success(function(Geek) {
        $scope.helloMessage = Geek;
    });
});


app.controller('SexeCtrl', function($scope, $http) {
    $http.get('/api/hello').success(function(Geek) {
        $scope.helloMessage = Geek;
    });
});