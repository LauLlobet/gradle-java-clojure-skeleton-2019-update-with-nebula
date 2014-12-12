(ns skel.core
  (:require [clj-time.local :as l]))

(defn local-time-str
  "return the passed string, plus the local date and time as a string"
  [a]
  (str a " " (l/format-local-time (l/local-now) :basic-date-time)))
