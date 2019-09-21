import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { CustomMessage } from './message/custom-message';

@Injectable({
  providedIn: 'root'
})
export class BasicExampleService {

  constructor(private http: HttpClient) { }

executeBasicExample(){
  return this.http.get<CustomMessage>('http://localhost:8080/basic-info');
}

}
