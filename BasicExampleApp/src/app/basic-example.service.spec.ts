import { TestBed } from '@angular/core/testing';

import { BasicExampleService } from './basic-example.service';

describe('BasicExampleService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: BasicExampleService = TestBed.get(BasicExampleService);
    expect(service).toBeTruthy();
  });
});
