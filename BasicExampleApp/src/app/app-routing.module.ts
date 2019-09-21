import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { BasicExampleComponent } from './basic-example/basic-example.component';


const routes: Routes = [
  {path:'' , component: BasicExampleComponent},
  {path:'basic-example', component:BasicExampleComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
