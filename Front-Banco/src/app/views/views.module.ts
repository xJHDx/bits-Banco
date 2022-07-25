import { CUSTOM_ELEMENTS_SCHEMA, NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { ViewsRoutingModule } from './views-routing.module';


@NgModule({
  declarations: [
  ],
  imports: [
    CommonModule,
    ViewsRoutingModule
  ],
  schemas: [CUSTOM_ELEMENTS_SCHEMA],
})
export class ViewsModule { }
