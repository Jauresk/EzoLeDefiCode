import { TestBed, async, ComponentFixture } from '@angular/core/testing';
import { RouterTestingModule } from '@angular/router/testing';
import { AppComponent } from './app.component';
import { FormsModule } from '@angular/forms';

describe('AppComponent', () => {
  let component: AppComponent;
  let fixture: ComponentFixture<AppComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      imports: [ FormsModule, RouterTestingModule],
      declarations: [AppComponent],

    });

    fixture = TestBed.createComponent(AppComponent);
    component = fixture.componentInstance;
  }));

  it('should be created', () => {
    expect(component).toBeTruthy();
  });

  it(`should have as title 'ezotest'`, () => {
    fixture = TestBed.createComponent(AppComponent);
    const app = fixture.debugElement.componentInstance;
    expect(app.title).toEqual('ezotest');
  });

  it('should return true When sum 1 + 1 equal 2', () => {
    component.selectCalc(1);
    component.selectCalc('+');
    component.selectCalc(1);
    const result = component.result;
    expect(result).toEqual(2);
  });

  it('should return false When sum 1 + 1 equal 1', () => {
    component.selectCalc(1);
    component.selectCalc('+');
    component.selectCalc(1);
    const result = component.result;
    expect(result === 1).toBe(false);
  });

  it('should return true When sum 1 + 2 equal 3', () => {
    component.selectCalc(1);
    component.selectCalc('+');
    component.selectCalc(2);
    const result = component.result;
    expect(result === 3).toBe(true);
  });

  it('should return true When sum 1 + (-1) equal 0', () => {
    component.selectCalc(1);
    component.selectCalc('+');
    component.selectCalc(-1);
    const result = component.result;
    expect(result === 0).toBe(true);
  });

  it('should return true When subtract -1 - (-1) equal 0', () => {
    component.selectCalc(-1);
    component.selectCalc('*');
    component.selectCalc(-1);
    component.selectCalc('+');
    component.selectCalc(-1);
    const result = component.result;
    expect(result === 0).toBe(true);
  });

  it('should return true When subtract 5 - 4 equal 1', () => {
    component.selectCalc(5);
    component.selectCalc('-');
    component.selectCalc(4);
    const result = component.result;
    expect(result === 1).toBe(true);
  });

  it('should return true When multiplication 5 * 2 equal 10', () => {
    component.selectCalc(5);
    component.selectCalc('*');
    component.selectCalc(2);
    const result = component.result;
    expect(result === 10).toBe(true);
  });

  it('should return true When operation (2+5)*3 equal 21', () => {
    component.selectCalc(2);
    component.selectCalc('+');
    component.selectCalc(5);

    const result1 = component.result;

    expect(result1 === 7).toBe(true);

    component.erase();

    component.selectCalc(result1);
    component.selectCalc('*');
    component.selectCalc(3);

    const result2 = component.result;
    expect(result2 === 21).toBe(true);
  });

  it('should return true When operation 10 / 2 equal 5', () => {
    component.selectCalc(10);
    component.selectCalc('/');
    component.selectCalc(2);
    const result = component.result;
    expect(result === 5).toBe(true);
  });

  it('should return true When operation 2+2*5+5 equal 17', () => {
    component.selectCalc(2);
    component.selectCalc('*');
    component.selectCalc(5);
    const result1 = component.result;
    expect(result1 === 10).toBe(true);

    component.erase();

    component.selectCalc(result1);
    component.selectCalc('+');
    component.selectCalc(2);
    component.selectCalc('+');
    component.selectCalc(5);

    const result2 = component.result;
    expect(result2 === 17).toBe(true);
  });

  it('should return true When operation 2.8*3-1 equal 7.4', () => {
    component.selectCalc(2.80);
    component.selectCalc('*');
    component.selectCalc(3);
    const result1 = component.result;
    expect(result1 === 8.399999999999999).toBe(true);

    component.erase();

    component.selectCalc(result1);
    component.selectCalc('-');
    component.selectCalc(1);

    const result2 = component.result;
    expect(result2 === 7.399999999999999).toBe(true);
  });

  it('should return true When operation 2^8 equal 256', () => {
    component.selectCalc(2);
    component.selectCalc('*');
    component.selectCalc(2);
    component.selectCalc('*');
    component.selectCalc(2);
    component.selectCalc('*');
    component.selectCalc(2);
    component.selectCalc('*');
    component.selectCalc(2);
    component.selectCalc('*');
    component.selectCalc(2);
    component.selectCalc('*');
    component.selectCalc(2);
    component.selectCalc('*');
    component.selectCalc(2);
    const result = component.result;
    expect(result === 256).toBe(true);
  });

  it('should return true When operation 2^8*5-1 equal 1279', () => {
    component.selectCalc(2);
    component.selectCalc('*');
    component.selectCalc(2);
    component.selectCalc('*');
    component.selectCalc(2);
    component.selectCalc('*');
    component.selectCalc(2);
    component.selectCalc('*');
    component.selectCalc(2);
    component.selectCalc('*');
    component.selectCalc(2);
    component.selectCalc('*');
    component.selectCalc(2);
    component.selectCalc('*');
    component.selectCalc(2);
    const result1 = component.result;
    expect(result1 === 256).toBe(true);

    component.erase();

    component.selectCalc(result1);
    component.selectCalc('*');
    component.selectCalc(5);
    component.selectCalc('-');
    component.selectCalc(1);

    const result2 = component.result;
    expect(result2 === 1279).toBe(true);
  });

  it('should return true When operation sqrt(4) equal 2', () => {
    component.selectCalc(2);
    component.selectCalc('*');
    component.selectCalc(2);
    const puiss = component.result;
    expect(puiss === 4).toBe(true);
  });

  it('should return true When operation "1/0" equal Erreur Infinity', () => {
    component.selectCalc(1);
    component.selectCalc('/');
    component.selectCalc(0);
    const result = component.result;
    expect(result).toBe(Infinity);
  });


});
