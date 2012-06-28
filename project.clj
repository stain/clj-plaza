(defproject stain/plaza "0.1.1-SNAPSHOT"
  :description "Plaza framework for semantic distributed applications"
  :dependencies [[org.clojure/clojure "1.3.0"]
                 [org.clojure/data.json "0.1.0"]
                 [org.clojure/tools.logging "0.1.2"]
                 [org.apache.jena/jena-core "2.7.0-incubating"]
                 [org.apache.jena/jena-arq "2.9.0-incubating"]
                 [net.rootdev/java-rdfa "0.4.2-RC2"]
                 [com.franz/openrdf-sesame-onejar "2.2"]]
  :repositories {"jboss" "http://repository.jboss.org/nexus/content/groups/public/"
                 "apache-repo-release" "https://repository.apache.org/content/repositories/releases/"}
  :dev-dependencies [[log4j "1.2.14"]]
  :exclusions [org.clojure/contrib
               org.clojure/clojure-contrib]
  :autodoc {:name "clj-plaza",
            :page-title "clj-plaza distributed semantic systems library"
            :author "Antonio Garrote <antoniogarrote@gmail.com> <agarrote@usal.es>"
            :copyright "2010 (c) Antonio Garrote, under the MIT license"
            :web-home "http://antoniogarrote.github.com/clj-plaza/api"})
