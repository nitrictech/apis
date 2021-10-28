generate: install-tools generate-proto
	@echo "Generating Go base SDK"

# Generate interfaces
generate-proto:
	@echo Generating Proto Sources
	@protoc --go_out=. --go-grpc_out=require_unimplemented_servers=false:. -I ../contracts/ ../contracts/*/*/**/*.proto

install:
	@go mod download

install-tools: install
	@echo Installing tools from tools.go
	@cat ./tools/tools.go | grep _ | awk -F'"' '{print $$2}' | xargs -tI % go get %