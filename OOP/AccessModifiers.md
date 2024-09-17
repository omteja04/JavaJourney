<h2><center>AccessModifiers</center></h2>

|                                                 | public                               | package-private or default           | private                              | protected                            |
| ----------------------------------------------- | ------------------------------------ | ------------------------------------ | ------------------------------------ | ------------------------------------ |
| **Within The Same Class**                       | <span style="color:green">YES</span> | <span style="color:green">YES</span> | <span style="color:green">YES</span> | <span style="color:green">YES</span> |
| **Within Other Classes of Same Package**        | <span style="color:green">YES</span> | <span style="color:green">YES</span> | <span style="color:red">NO</span>    | <span style="color:green">YES</span> |
| **Within Other Child Classes in Other Package** | <span style="color:green">YES</span> | <span style="color:red">NO</span>    | <span style="color:red">NO</span>    | <span style="color:green">YES</span> |
| **Within Other Classes in Other Package**       | <span style="color:green">YES</span> | <span style="color:red">NO</span>    | <span style="color:red">NO</span>    | <span style="color:red">NO</span>    |
