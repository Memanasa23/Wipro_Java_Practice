import { ComponentFixture, TestBed } from '@angular/core/testing';

import { NameSearch } from './name-search';

describe('NameSearch', () => {
  let component: NameSearch;
  let fixture: ComponentFixture<NameSearch>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [NameSearch]
    })
    .compileComponents();

    fixture = TestBed.createComponent(NameSearch);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
