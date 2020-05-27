/* tslint:disable:no-unused-variable */

import { TestBed, async, inject } from '@angular/core/testing';
import { OperationServiceService } from './operation-service.service';

describe('Service: OperationService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [OperationServiceService]
    });
  });

  it('should ...', inject([OperationServiceService], (service: OperationServiceService) => {
    expect(service).toBeTruthy();
  }));
});
