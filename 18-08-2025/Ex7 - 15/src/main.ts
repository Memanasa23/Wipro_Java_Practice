import { bootstrapApplication } from '@angular/platform-browser';
import { appConfig } from './app/app.config';
// import { NameSearch } from './app/name-search/name-search';
import { Colors } from './app/colors/colors';
// import { Home } from './app/home/home';

bootstrapApplication(Colors, appConfig)
  .catch((err) => console.error(err));
