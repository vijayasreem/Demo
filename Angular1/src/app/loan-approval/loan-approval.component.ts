import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';

@Component({
  selector: 'app-loan-approval',
  templateUrl: './loan-approval.component.html',
  styleUrls: ['./loan-approval.component.css']
})
export class LoanApprovalComponent implements OnInit {
  loanApprovalForm: FormGroup;

  constructor(private formBuilder: FormBuilder) { }

  ngOnInit() {
    this.loanApprovalForm = this.formBuilder.group({
      identification: ['', Validators.required],
      proofOfIncome: ['', Validators.required],
      creditHistory: ['', Validators.required],
      employmentDetails: ['', Validators.required]
    });
  }

  submitLoanApprovalForm() {
    if (this.loanApprovalForm.invalid) {
      return;
    }

    // Implement API calls for loan approval with specific terms and conditions

    console.log('Loan approval form submitted');
  }
}