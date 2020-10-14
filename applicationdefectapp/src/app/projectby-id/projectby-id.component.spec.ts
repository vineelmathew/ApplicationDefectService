import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ProjectbyIdComponent } from './projectby-id.component';

describe('ProjectbyIdComponent', () => {
  let component: ProjectbyIdComponent;
  let fixture: ComponentFixture<ProjectbyIdComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ProjectbyIdComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ProjectbyIdComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
