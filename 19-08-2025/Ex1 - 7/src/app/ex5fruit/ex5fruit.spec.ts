import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Ex5fruit } from './ex5fruit';

describe('Ex5fruit', () => {
  let component: Ex5fruit;
  let fixture: ComponentFixture<Ex5fruit>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Ex5fruit]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Ex5fruit);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
