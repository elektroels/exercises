(ns exercises.core
  (:gen-class))

; Dynamic Programming
;
; Climbing Stairs Problem 
; https://leetcode.com/problems/climbing-stairs/
; https://www.enjoyalgorithms.com/blog/climbing-stairs-problem
; Example 5 stairs = 8 ways
;
; Youtube Solution : https://www.youtube.com/watch?v=Y0lT9Fck7qI
;
; Scheme style wrapper for only 1 argument 
(defn climb-stairs [n]
  (letfn [(stairs-rec [one two n]
    (if (> 1 n) ; outputs 1 even if the argument is invalid
      one
      (stairs-rec (+ one two) one (dec n))))]
    (stairs-rec 1 1 (dec n))))