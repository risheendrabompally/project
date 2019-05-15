import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { LoginCustomersComponent } from './login-customers.component';

describe('LoginCustomersComponent', () => {
  let component: LoginCustomersComponent;
  let fixture: ComponentFixture<LoginCustomersComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ LoginCustomersComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(LoginCustomersComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
