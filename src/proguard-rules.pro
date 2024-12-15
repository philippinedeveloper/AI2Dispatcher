# Add any ProGuard configurations specific to this
# extension here.

-keep public class ph.bxtdev.AI2Dispatcher.AI2Dispatcher {
    public *;
 }
-keeppackagenames gnu.kawa**, gnu.expr**

-optimizationpasses 4
-allowaccessmodification
-mergeinterfacesaggressively

-repackageclasses 'ph/bxtdev/AI2Dispatcher/repack'
-flattenpackagehierarchy
-dontpreverify
