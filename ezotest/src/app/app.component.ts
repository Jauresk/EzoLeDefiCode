import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'ezotest';

  a;
  b;
  selection;

  result: number;
  console = console;

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
  calculadd(a, b) {
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
  }

// div, pdt, sub, add
}
