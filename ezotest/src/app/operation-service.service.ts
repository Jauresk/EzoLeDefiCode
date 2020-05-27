import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { environment } from 'src/environments/environment';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export abstract class OperationServiceService<T> {

  constructor(protected httpClient: HttpClient, private endpoint: string) {}

  protected urlEndpoint = `${environment.apiUrl}/${this.endpoint}`;

  operation(a: number, b: number, op: string): Observable<T> {
    return this.httpClient.get<T>(`${this.urlEndpoint}/${op}/${a}/${b}`);
  }


}
