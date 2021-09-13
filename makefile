generate: generate-go generate-jvm generate-node generate-python
	@echo "Generated Base SDKs"

generate-go:
	@echo "Generate go base SDK"
	@cd go && make

generate-jvm:
	@echo "Generate JVM base SDK"
	@cd jvm && mvn generate-sources

generate-node:
	@echo "Generate Node.js base SDK"
	@cd node && yarn install --frozen-lockfile && yarn build

generate-python:
	@echo "Generate python base SDK"
	@cd python && make