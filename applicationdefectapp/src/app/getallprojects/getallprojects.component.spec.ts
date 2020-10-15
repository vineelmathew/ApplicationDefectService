import { ComponentFixture, TestBed } from '@angular/core/testing';

import { GetallprojectsComponent } from './getallprojects.component';

describe('GetallprojectsComponent', () => {
  let component: GetallprojectsComponent;
  let fixture: ComponentFixture<GetallprojectsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ GetallprojectsComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(GetallprojectsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
