angular.module('calculApp', [])
  .controller('calculController', function($scope, $http) {
  var calcul = this;
  var i = 0;
  $scope.panel = "";
  $scope.result = 0;

  $scope.selectCalc = function (value) {
  console.log("select value "+value)
  //if ($scope.result == 0 && value != '/' && value != '*' && value != '-' && value != '+' && value != '.' && value != '%') {
  if ($scope.result == 0 && value == 0 && value != '/' && value != '*' && value != '-' && value != '+' && value != '.' && value != '%') {
  $scope.panel = "";
   console.log("vider pannel ");
  } else {
  $scope.panel = $scope.panel + "" + value;
  }

  console.log("tableau $scope.calcul "+$scope.panel);
  if (value != '/' && value != '*' && value != '-' && value != '+' && value != '.' && value != '%') {

  $scope.result = $scope.$eval($scope.panel);
  i++;
  }
  }

  $scope.erase = function () {
  $scope.panel = "";
  $scope.result = 0;
  i = 0;
  }

  $scope.equal = function () {
  $scope.result = eval($scope.panel);
  }

  $scope.pourCalc = function () {

    $scope.panel = "";
    $scope.panel = parseInt($scope.panel) / 100;
    console.log("value pourcentage "+$scope.panel)
    $scope.result = $scope.panel;

  }

  });