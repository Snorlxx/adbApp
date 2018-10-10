import { Component, OnInit } from '@angular/core';
import { Customers } from '../Model/Customers';
import { SubscriberService } from '../Service/subscriber.service';

@Component({
  selector: 'app-my-profile',
  templateUrl: './my-profile.component.html',
  styleUrls: ['./my-profile.component.css']
})
export class MyProfileComponent implements OnInit {

 // users:Customers;
  myaccountinfo:Customers;
  constructor(private subsriberserv:SubscriberService) { }

  ngOnInit() {
    this.subsriberserv.getSubscriberByRmn().subscribe(
      data=>this.myaccountinfo=data
    );

  //  this.myaccountinfo=this.users[0];
  }

}
