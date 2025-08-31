import { TestBed } from '@angular/core/testing';
import { AppComponent } from './app.component';

describe('AppComponent Palindrome Tests', () => {
  let component: AppComponent;

  beforeEach(() => {
    component = new AppComponent();
  });

  it('should return true for "madam"', () => {
    expect(component.isPalindrome('madam')).toBeTrue();
  });

  it('should return true for "level"', () => {
    expect(component.isPalindrome('level')).toBeTrue();
  });

  it('should return false for "hello"', () => {
    expect(component.isPalindrome('hello')).toBeFalse();
  });

  it('should return false for empty string', () => {
    expect(component.isPalindrome('')).toBeFalse();
  });
});
