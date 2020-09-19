; print statement
(print "whats your name")

;global variables->defvar remain constant until a new value if provided

(defvar x 200)
(print x)
(write x)
; have to check diif between print and write function in lisp

; no type declaration variables can be direclty set using setq construct
(setq x 20)
(print x)


(print (+ 1 2))

; function declration adding two functions :p

(defun testfun (x y)
  (+ x y))
 
(print (testfun 4 5))

;loops

(loop for x in '(1 2 3)
 do (print x) )


;(loop for i in '(1 2 3)
 ;when(> i 1)
 ; (print i))



