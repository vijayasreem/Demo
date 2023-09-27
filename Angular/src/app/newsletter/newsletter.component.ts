import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { ApiService } from 'path-to-api-service';

@Component({
  selector: 'app-newsletter',
  templateUrl: './newsletter.component.html',
  styleUrls: ['./newsletter.component.css']
})
export class NewsletterComponent implements OnInit {
  newsletterForm: FormGroup;
  
  constructor(private apiService: ApiService) { }
  
  ngOnInit() {
    this.newsletterForm = new FormGroup({
      email: new FormControl('', [Validators.required, Validators.email])
    });
  }
  
  sendNewsletter() {
    if (this.newsletterForm.valid) {
      const email = this.newsletterForm.get('email').value;
      // Call API to send newsletter
      this.apiService.sendNewsletter(email).subscribe(
        response => {
          // Handle success
          console.log('Newsletter sent successfully!');
        },
        error => {
          // Handle error
          console.error('Failed to send newsletter:', error);
        }
      );
    }
  }
}