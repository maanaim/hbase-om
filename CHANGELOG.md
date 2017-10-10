# Changelog

This is a simple changelog for a another simple HBase Object Mapper.

The format is based on [Keep a Changelog](http://keepachangelog.com/en/1.0.0/)
and this project adheres to [Semantic Versioning](http://semver.org/spec/v2.0.0.html).

## [Unreleased]
### Added
- Travis ci
- Javadoc
- Mask to zip code, e-mail, money
- Map fields to enum

## [1.3.0] - 2017-09-28
### Added
- Search by QBE (Query by Example)

## [1.2.0] - 2017-09-08
### Added
- Unit tests
- Strategy to create types
- Format string fields by lower, upper, lower camel and upper camel case
- Changelog

### Changed
- HBase client library was updated to 1.1.12

### Fixed
- Bug convert date


## [1.1.2] - 2017-08-23
### Fixed
- System.out.println 


## [1.1.1] - 2017-08-23
### Changed
- Parameter to connect to HBase was changed from Connection to Table

### Removed
- Removed the support to HBaseTable annotation to read table name 

### Fixed
- Correct handler when type isn't equal the data


## [1.0.1] - 2017-08-21
### Added
- Log4j
- Throw exception when to fail HBase connection


## [1.0.1] - 2017-06-05
### Fixed
- Exclude System.out.println from code


## [1.0.0] - 2017-06-05
### Added
- License
- Readme
- Annotations
- Abstract Data Access Object
- Very simple sample
