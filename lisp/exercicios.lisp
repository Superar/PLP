(defun reversa (lista)
  (do ( (aux lista (cdr aux)) (res ()) )
    ( (null aux) res )
    (setq res (append (list (car aux)) res))
  )
)

(defun palindromize (lista)
  (append lista (reversa lista))
)

(defun palindromop (lista)
  (cond ( (<= (length lista) 1) nil )
    ( t
     (do ( (i 0 (+ i 1)) (tam (length lista)) (res t) )
       ( (or (equal res nil) (= i (/ tam 2))) res )
       (cond ( (= (mod tam 2) 1) (setq tam (- tam 1)) ))
       (cond ( (not (equal (nth i lista) (nth (- (- (length lista) i) 1) lista))) (setq res nil) ))
     )
    )
  )
)

(defun tri-retan (maior menor1 menor2)
  (cond ( (> (+ (* menor1 menor1) (* menor2 menor2)) (* 0.98 (* maior maior))) T )
    ( t nil )
  )
)

(defun circulo (raio)
  (list (* (* 2 PI) raio) (* PI (* raio raio)))
)

(defun squash (lista)
  (cond ( (null lista) nil )
    ( (atom lista) (list lista) )
    ( t (append (squash (car lista)) (squash (cdr lista))) )
  )
)

(defun esta-em (a lista)
  (cond ( (null lista) nil )
    ( (and (atom (car lista)) (equal (car lista) a)) t )
    ( (not (atom (car lista))) (esta-em a (car lista)) )
    ( t (esta-em a (cdr lista)) )
  )
)

(defun _max (lista)
  (do ( (i 0 (+ i 1)) (res (car lista)) )
    ( (= i (length lista)) res )
    (cond ( (> (nth i lista) res) (setq res (nth i lista)) )
    )
  )
)

(defun _min (lista)
  (do ( (i 0 (+ i 1)) (res (car lista)) )
    ( (= i (length lista)) res )
    (cond ( (< (nth i lista) res) (setq res (nth i lista)) )
    )
  )
)

(defun max-min (lista)
  (- (_max lista) (_min lista))
)

(defun uniao (c1 c2)
  (do ( (i 0 (+ i 1)) (res c2) )
    ( (= i (length c1)) res )
    (cond ( (not (esta-em (nth i c1) res)) (setq res (cons (nth i c1) res)) )
    )
  )
)

(defun inter (c1 c2)
  (do ( (i 0 (+ i 1)) (res ()) )
    ( (= i (length c1)) res )
    (cond ( (esta-em (nth i c1) c2) (setq res (cons (nth i c1) res)) )
    )
  )
)

(defun difer (c1 c2)
  (do ( (i 0 (+ i 1)) (res ()) )
    ( (= i (length c1)) res )
    (cond ( (not (esta-em (nth i c1) (inter c1 c2))) (setq res (cons (nth i c1) res)) )
    )
  )
)
