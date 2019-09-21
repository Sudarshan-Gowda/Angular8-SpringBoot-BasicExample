import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { BasicExampleService } from '../basic-example.service';
import { CustomMessage } from '../message/custom-message';

@Component({
  selector: 'app-basic-example',
  templateUrl: './basic-example.component.html',
  styleUrls: ['./basic-example.component.css']
})
export class BasicExampleComponent implements OnInit {

  constructor(private route: ActivatedRoute, private router: Router, private helloworldService: BasicExampleService) { }

  customMessage: CustomMessage;

  ngOnInit() {

    this.helloworldService.executeBasicExample().subscribe((res)=>{
      this.customMessage = res;
    });
  }

}
