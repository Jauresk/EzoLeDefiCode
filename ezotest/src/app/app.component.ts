import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'ezotest';

  i = 0;
  panel = '';
  result = 0;

  console = console;

  selectCalc(value) {
    console.log(value);
    // if ($scope.result == 0 && value != '/' && value != '*' && value != '-' && value != '+' && value != '.' && value != '%') {
    /*if (this.result === 0 && value === 0 && value !== '/' && value !== '*' &&
    value !== '-' && value !== '+' && value !== '.' && value !== '%') {
    this.panel = '';
     // console.log('vider pannel ');
    } else {
    }*/

    if (this.result === 0) {
      this.panel = '';
    }

    this.panel = this.panel + '' + value;
    // console.log("tableau $scope.calcul "+$scope.panel);
    if (value !== '/' && value !== '*' && value !== '-' && value !== '+' && value !== '.' && value !== '%') {
    this.result = eval.call(this, this.panel);
    this.i++;
    }
    }

    erase() {
      this.panel = '';
      this.result = 0;
      this.i = 0;
    }

    equal() {
      this.result = eval.call(this, this.panel);
    }

    pourCalc() {
        this.panel = '';
        this.panel = String(Number(this.panel) / 100);
        // console.log("value pourcentage "+$scope.panel)
        this.result = Number(this.panel);
      }

  /*calcul(a, b, selection) {
    if (selection === 'add') {
      this.result = a + b;
    }
    if (selection === 'sub') {
      this.result = a - b;
    }
    if (selection === 'pdt') {
      this.result = a * b;
    }
    if (selection === 'div') {
      this.result = a / b;
    }
  }*/
  /*calculadd(a, b) {
    this.result = Number(a) + Number(b);
  }

  calculsub(a, b) {
  this.result = a - b;
  }

  calculpdt(a, b) {
  this.result = a * b;
  }

  calculdiv(a, b) {
  this.result = a / b;
  }*/

// div, pdt, sub, add
}
