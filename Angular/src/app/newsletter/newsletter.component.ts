import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';

@Component({
  selector: 'app-newsletter',
  templateUrl: './newsletter.component.html',
  styleUrls: ['./newsletter.component.css']
})
export class NewsletterComponent implements OnInit {
  newsletterForm: FormGroup;

  constructor(private formBuilder: FormBuilder) { }

  ngOnInit() {
    this.newsletterForm = this.formBuilder.group({
      email: ['', [Validators.required, Validators.email]],
      message: ['', Validators.required]
    });
  }

  sendNewsletters() {
    if (this.newsletterForm.valid) {
      // Implement API call to send newsletters to registered customers
      console.log('Sending newsletters...');
    } else {
      // Handle form validation errors
      this.newsletterForm.markAllAsTouched();
    }
  }
}