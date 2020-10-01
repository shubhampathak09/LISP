;toss-coin function
;(defun toss-coin()
;16)
;(toss-coin)
;(print (toss-coin))

; another way to print something out in lisp

;(format t "~%~A" (toss-coin))

(defun toss-coin()
 "Generate a random heads or tails"
(let ((number (random 2 (make-random-state t))))
 (if (= number 0)
  "heads"
  "tails")))

;(print (toss-coin))


(defun prompt ()
 "take input of heads and tails and loop through incase the input is not a head or tail"
(format t "Please enter heads or tails: ")
(force-output )

(let ((guess (string-downcase (read-line))))
 (if (or (string= guess "heads") (string= guess "tails"))
  guess
  (prompt))))

 ; (print (prompt))
  
(defun game()
(if (string= (prompt)
(toss-coin))
(format t "You Win~%")
(format t "You lose~%")))

(game)
