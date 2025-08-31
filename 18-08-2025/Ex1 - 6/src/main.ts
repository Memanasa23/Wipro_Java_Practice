import { bootstrapApplication } from '@angular/platform-browser';
import { appConfig } from './app/app.config';
import { Welcome } from './app/welcome/welcome';

bootstrapApplication(Welcome, appConfig)
  .catch((err) => console.error(err));
