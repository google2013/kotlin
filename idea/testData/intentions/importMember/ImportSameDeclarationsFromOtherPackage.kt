// INTENTION_TEXT: "Add import for 'imports.a.b.foo6'"

package imports.a

import imports.a.b.foo1
import imports.a.b.foo2
import imports.a.b.foo3
import imports.a.b.foo4
import imports.a.b.foo5

fun foo1() = foo1()
fun foo2() = foo2()
fun foo3() = foo3()
fun foo4() = foo4()
fun foo5() = foo5()
fun foo6() = imports.<caret>a.b.foo6()

// NAME_COUNT_TO_USE_STAR_IMPORT: 3