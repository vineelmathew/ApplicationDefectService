import { ComponentFixture, TestBed } from '@angular/core/testing';

import { GetalldefectsComponent } from './getalldefects.component';

describe('GetalldefectsComponent', () => {
  let component: GetalldefectsComponent;
  let fixture: ComponentFixture<GetalldefectsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ GetalldefectsComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(GetalldefectsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
