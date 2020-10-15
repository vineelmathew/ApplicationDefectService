import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DefectbyIdComponent } from './defectby-id.component';

describe('DefectbyIdComponent', () => {
  let component: DefectbyIdComponent;
  let fixture: ComponentFixture<DefectbyIdComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DefectbyIdComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(DefectbyIdComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
