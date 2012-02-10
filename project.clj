(defproject net.kronkltd/plaza "0.0.6-SNAPSHOT"
  :description "Plaza framework for semantic distributed applications"
  :dependencies [[org.clojure/clojure "1.3.0"]
                 [org.clojure/data.json "0.1.0"]
                 [org.clojure/tools.logging "0.1.2"]
                 [com.hp.hpl.jena/jena "2.6.4"]
                 [com.hp.hpl.jena/arq "2.8.8"]
                 [net.rootdev/java-rdfa "0.4.2-RC2"]
                 [log4j "1.2.14"]]
  :repositories {"jboss"
                 "http://repository.jboss.org/nexus/content/groups/public/" }
  :exclusions [org.clojure/contrib
               org.clojure/clojure-contrib]
  :main     plaza.core
  :autodoc {:name "clj-plaza",
            :page-title "clj-plaza distributed semantic systems library"
            :author "Antonio Garrote <antoniogarrote@gmail.com> <agarrote@usal.es>"
            :copyright "2010 (c) Antonio Garrote, under the MIT license"
            :web-home "http://antoniogarrote.github.com/clj-plaza/api"})
