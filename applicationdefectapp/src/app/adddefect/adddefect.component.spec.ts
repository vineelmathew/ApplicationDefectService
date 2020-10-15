import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AdddefectComponent } from './adddefect.component';

describe('AdddefectComponent', () => {
  let component: AdddefectComponent;
  let fixture: ComponentFixture<AdddefectComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AdddefectComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AdddefectComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
