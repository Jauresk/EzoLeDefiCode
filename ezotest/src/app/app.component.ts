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

    if (value !== '/' && value !== '*' && value !== '-' && value !== '+' && value !== '.' && value !== '%') {
    if (Number(eval.call(this, this.panel))) {}
    this.result = eval.call(this, this.panel);
    console.log('this.result ', this.result);
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


}
