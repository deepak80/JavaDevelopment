public class  MySecondProgram{
	public static void main(String argv[]){
		System.out.print("Welcome Engineer.....!!☺☺");
	}//End of main method
}//End of the class

/*This fiel contain unicode character and saved in Unicode encoding at compile time it gives error like:

javac MySecondProgram_1.java
MySecondProgram_1.java:1: error: illegal character: '\u0000'
 ■p u b l i c   c l a s s     M y S e c o n d P r o g r a m {
               ^
MySecondProgram_1.java:1: error: illegal character: '\u0000'
 ■p u b l i c   c l a s s     M y S e c o n d P r o g r a m {
                           ^
MySecondProgram_1.java:1: error: illegal character: '\u0000'
 ■p u b l i c   c l a s s     M y S e c o n d P r o g r a m {
                             ^
MySecondProgram_1.java:1: error: illegal character: '\u0000'
 ■p u b l i c   c l a s s     M y S e c o n d P r o g r a m {
                                                             ^
MySecondProgram_1.java:2: error: illegal character: '\u0000'

^
MySecondProgram_1.java:3: error: illegal character: '\u0000'
         p u b l i c   s t a t i c   v o i d   m a i n ( S t r i n g   a r g v [ ] ) {
^
MySecondProgram_1.java:3: error: illegal character: '\u0000'
         p u b l i c   s t a t i c   v o i d   m a i n ( S t r i n g   a r g v [ ] ) {
        ^
MySecondProgram_1.java:3: error: ';' expected
         p u b l i c   s t a t i c   v o i d   m a i n ( S t r i n g   a r g v [ ] ) {
         ^
MySecondProgram_1.java:3: error: illegal character: '\u0000'
         p u b l i c   s t a t i c   v o i d   m a i n ( S t r i n g   a r g v [ ] ) {
                      ^
MySecondProgram_1.java:3: error: ';' expected
         p u b l i c   s t a t i c   v o i d   m a i n ( S t r i n g   a r g v [ ] ) {
                       ^
MySecondProgram_1.java:3: error: illegal character: '\u0000'
         p u b l i c   s t a t i c   v o i d   m a i n ( S t r i n g   a r g v [ ] ) {
                                    ^
MySecondProgram_1.java:3: error: ';' expected
         p u b l i c   s t a t i c   v o i d   m a i n ( S t r i n g   a r g v [ ] ) {
                                     ^
MySecondProgram_1.java:3: error: illegal character: '\u0000'
         p u b l i c   s t a t i c   v o i d   m a i n ( S t r i n g   a r g v [ ] ) {
                                              ^
MySecondProgram_1.java:3: error: ';' expected
         p u b l i c   s t a t i c   v o i d   m a i n ( S t r i n g   a r g v [ ] ) {
                                                       ^
MySecondProgram_1.java:3: error: illegal character: '\u0000'
         p u b l i c   s t a t i c   v o i d   m a i n ( S t r i n g   a r g v [ ] ) {
                                                        ^
MySecondProgram_1.java:3: error: illegal character: '\u0000'
         p u b l i c   s t a t i c   v o i d   m a i n ( S t r i n g   a r g v [ ] ) {
                                                                      ^
MySecondProgram_1.java:3: error: not a statement
         p u b l i c   s t a t i c   v o i d   m a i n ( S t r i n g   a r g v [ ] ) {
                                                         ^
MySecondProgram_1.java:3: error: illegal character: '\u0000'
         p u b l i c   s t a t i c   v o i d   m a i n ( S t r i n g   a r g v [ ] ) {
                                                                                ^
MySecondProgram_1.java:3: error: not a statement
         p u b l i c   s t a t i c   v o i d   m a i n ( S t r i n g   a r g v [ ] ) {
                                                                               ^
MySecondProgram_1.java:3: error: ';' expected
         p u b l i c   s t a t i c   v o i d   m a i n ( S t r i n g   a r g v [ ] ) {
                                                                                 ^
MySecondProgram_1.java:3: error: illegal character: '\u0000'
         p u b l i c   s t a t i c   v o i d   m a i n ( S t r i n g   a r g v [ ] ) {
                                                                                  ^
MySecondProgram_1.java:3: error: ';' expected
         p u b l i c   s t a t i c   v o i d   m a i n ( S t r i n g   a r g v [ ] ) {
                                                                                   ^
MySecondProgram_1.java:3: error: illegal character: '\u0000'
         p u b l i c   s t a t i c   v o i d   m a i n ( S t r i n g   a r g v [ ] ) {
                                                                                    ^
MySecondProgram_1.java:3: error: ';' expected
         p u b l i c   s t a t i c   v o i d   m a i n ( S t r i n g   a r g v [ ] ) {
                                                                                     ^
MySecondProgram_1.java:3: error: illegal character: '\u0000'
         p u b l i c   s t a t i c   v o i d   m a i n ( S t r i n g   a r g v [ ] ) {
                                                                                      ^
MySecondProgram_1.java:4: error: illegal character: '\u0000'

^
MySecondProgram_1.java:5: error: illegal character: '\u0000'
                 S y s t e m . o u t . p r i n t ( " W e l c o m e   E n g i n e e r . . . . . ! ! :&:&" ) ;
^
MySecondProgram_1.java:5: error: illegal character: '\u0000'
                 S y s t e m . o u t . p r i n t ( " W e l c o m e   E n g i n e e r . . . . . ! ! :&:&" ) ;
        ^
MySecondProgram_1.java:5: error: illegal character: '\u0000'
                 S y s t e m . o u t . p r i n t ( " W e l c o m e   E n g i n e e r . . . . . ! ! :&:&" ) ;
                ^
MySecondProgram_1.java:5: error: ';' expected
                 S y s t e m . o u t . p r i n t ( " W e l c o m e   E n g i n e e r . . . . . ! ! :&:&" ) ;
                             ^
MySecondProgram_1.java:5: error: illegal character: '\u0000'
                 S y s t e m . o u t . p r i n t ( " W e l c o m e   E n g i n e e r . . . . . ! ! :&:&" ) ;
                              ^
MySecondProgram_1.java:5: error: illegal character: '\u0000'
                 S y s t e m . o u t . p r i n t ( " W e l c o m e   E n g i n e e r . . . . . ! ! :&:&" ) ;
                                      ^
MySecondProgram_1.java:5: error: not a statement
                 S y s t e m . o u t . p r i n t ( " W e l c o m e   E n g i n e e r . . . . . ! ! :&:&" ) ;
                                     ^
MySecondProgram_1.java:5: error: illegal character: '\u0000'
                 S y s t e m . o u t . p r i n t ( " W e l c o m e   E n g i n e e r . . . . . ! ! :&:&" ) ;
                                                  ^
MySecondProgram_1.java:5: error: ';' expected
                 S y s t e m . o u t . p r i n t ( " W e l c o m e   E n g i n e e r . . . . . ! ! :&:&" ) ;
                                                   ^
MySecondProgram_1.java:5: error: illegal character: '\u0000'
                 S y s t e m . o u t . p r i n t ( " W e l c o m e   E n g i n e e r . . . . . ! ! :&:&" ) ;
                                                                                                        ^
MySecondProgram_1.java:5: error: ';' expected
                 S y s t e m . o u t . p r i n t ( " W e l c o m e   E n g i n e e r . . . . . ! ! :&:&" ) ;
                                                                                                         ^
MySecondProgram_1.java:5: error: illegal character: '\u0000'
                 S y s t e m . o u t . p r i n t ( " W e l c o m e   E n g i n e e r . . . . . ! ! :&:&" ) ;
                                                                                                          ^
MySecondProgram_1.java:5: error: illegal character: '\u0000'
                 S y s t e m . o u t . p r i n t ( " W e l c o m e   E n g i n e e r . . . . . ! ! :&:&" ) ;
                                                                                                            ^
MySecondProgram_1.java:6: error: illegal character: '\u0000'

^
MySecondProgram_1.java:7: error: illegal character: '\u0000'
         } / / E n d   o f   m a i n   m e t h o d
^
MySecondProgram_1.java:7: error: illegal character: '\u0000'
         } / / E n d   o f   m a i n   m e t h o d
        ^
MySecondProgram_1.java:7: error: ';' expected
         } / / E n d   o f   m a i n   m e t h o d
         ^
MySecondProgram_1.java:7: error: illegal character: '\u0000'
         } / / E n d   o f   m a i n   m e t h o d
          ^
MySecondProgram_1.java:7: error: illegal character: '\u0000'
         } / / E n d   o f   m a i n   m e t h o d
            ^
MySecondProgram_1.java:7: error: not a statement
         } / / E n d   o f   m a i n   m e t h o d
           ^
MySecondProgram_1.java:7: error: illegal start of expression
         } / / E n d   o f   m a i n   m e t h o d
             ^
MySecondProgram_1.java:7: error: illegal character: '\u0000'
         } / / E n d   o f   m a i n   m e t h o d
              ^
MySecondProgram_1.java:7: error: illegal character: '\u0000'
         } / / E n d   o f   m a i n   m e t h o d
                      ^
MySecondProgram_1.java:7: error: not a statement
         } / / E n d   o f   m a i n   m e t h o d
               ^
MySecondProgram_1.java:7: error: illegal character: '\u0000'
         } / / E n d   o f   m a i n   m e t h o d
                            ^
MySecondProgram_1.java:7: error: not a statement
         } / / E n d   o f   m a i n   m e t h o d
                       ^
MySecondProgram_1.java:7: error: illegal character: '\u0000'
         } / / E n d   o f   m a i n   m e t h o d
                                      ^
MySecondProgram_1.java:7: error: not a statement
         } / / E n d   o f   m a i n   m e t h o d
                             ^
MySecondProgram_1.java:8: error: illegal character: '\u0000'

^
MySecondProgram_1.java:7: error: not a statement
         } / / E n d   o f   m a i n   m e t h o d
                                       ^
MySecondProgram_1.java:9: error: illegal character: '\u0000'
 } / / E n d   o f   t h e   c l a s s
^
MySecondProgram_1.java:9: error: illegal character: '\u0000'
 } / / E n d   o f   t h e   c l a s s
  ^
MySecondProgram_1.java:9: error: illegal character: '\u0000'
 } / / E n d   o f   t h e   c l a s s
    ^
MySecondProgram_1.java:9: error: illegal character: '\u0000'
 } / / E n d   o f   t h e   c l a s s
      ^
MySecondProgram_1.java:9: error: illegal character: '\u0000'
 } / / E n d   o f   t h e   c l a s s
              ^
MySecondProgram_1.java:9: error: illegal character: '\u0000'
 } / / E n d   o f   t h e   c l a s s
                    ^
MySecondProgram_1.java:9: error: illegal character: '\u0000'
 } / / E n d   o f   t h e   c l a s s
                            ^
MySecondProgram_1.java:9: error: reached end of file while parsing
 } / / E n d   o f   t h e   c l a s s
                                       ^
64 errors
*/