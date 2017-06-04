package gov.ed.fsa.form;

import gov.ed.fsa.model.Borrower;
import gov.ed.fsa.model.EAMPNPerson;
import gov.ed.fsa.model.Employer;
import gov.ed.fsa.model.Reference;
import gov.ed.fsa.model.School;
import gov.ed.fsa.model.Student;

public class EAForm  {
	
	public EAForm(EAMPNPerson endorser, Reference reference1, Reference reference2, Borrower borrower, Student student, School school, Employer employer){
		this.endorser = endorser;
		this.reference1 = reference1;
		this.reference2 = reference2;
		this.borrower = borrower;
		this.student = student;
		this.school = school;
		this.employer = employer;
	}

	private EAMPNPerson endorser;
	private Reference reference1;
	private Reference reference2;
	private Borrower borrower;

	private Student student;
	private School school;
	private Employer employer;
	
	public Borrower getBorrower() {
		return borrower;
	}
	public void setBorrower(Borrower borrower) {
		this.borrower = borrower;
	}
	public EAMPNPerson getEndorser() {
		return endorser;
	}
	public void setEndorser(EAMPNPerson endorser) {
		this.endorser = endorser;
	}
	public Reference getReference1() {
		return reference1;
	}
	public void setReference1(Reference reference1) {
		this.reference1 = reference1;
	}
	public Reference getReference2() {
		return reference2;
	}
	public void setReference2(Reference reference2) {
		this.reference2 = reference2;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public School getSchool() {
		return school;
	}
	public void setSchool(School school) {
		this.school = school;
	}
	public Employer getEmployer() {
		return employer;
	}
	public void setEmployer(Employer employer) {
		this.employer = employer;
	}

	
	

}
