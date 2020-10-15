import { ComponentFixture, TestBed } from '@angular/core/testing';

import { UpdatedefectComponent } from './updatedefect.component';

describe('UpdatedefectComponent', () => {
  let component: UpdatedefectComponent;
  let fixture: ComponentFixture<UpdatedefectComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ UpdatedefectComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(UpdatedefectComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
