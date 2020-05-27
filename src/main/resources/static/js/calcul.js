angular.module('calculApp', [])
  .controller('calculController', function($scope, $http) {
  var calcul = this;

  $scope.panel = 0;
  $scope.a = 0;
  $scope.b = 0;
  $scope.result = 0;

  $scope.op = "";
  $scope.api = "http://localhost:8080/form/";


  $scope.selectCalc = function (value) {
  console.log("select value "+value)
  if ($scope.panel == 0 || $scope.op == "add") {
  $scope.panel = "";
  $scope.op = "";
  }
  $scope.panel = $scope.panel + "" + value;
  }

  $scope.erase = function () {
  $scope.panel = "";
  }

  $scope.divCalc = function () {

  }

  $scope.pdtCalc = function () {

  }

  $scope.subCalc = function () {

  }

  $scope.addCalc = function () {
  if ($scope.a == 0) {
    $scope.a = $scope.panel;
    $scope.erase();
    console.log("value a "+$scope.a)
  } else {
  $scope.a = parseInt($scope.a) + parseInt($scope.panel);
  console.log("value a additionnee "+$scope.a)
  $scope.panel = "";
  $scope.panel = $scope.a;
  $scope.op = "add";
// http://localhost:8080/form/
  /*$http.get("$scope.api/add/"+$scope.a+"/"+$scope.panel).then(function (response) {
                 // $scope.subjectHasClassParClasse=response.data;
              },function (response) {

                  console.log(response);
              });*/
  }

  }


  });